import {Component, OnInit} from '@angular/core';
import {MessageService} from 'src/app/controller/service/Message.service';
import {MessageDto} from 'src/app/controller/model/Message.model';
import {MessageCriteria} from 'src/app/controller/criteria/MessageCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-message-list-admin',
  templateUrl: './message-list-admin.component.html'
})
export class MessageListAdminComponent extends AbstractListController<MessageDto, MessageCriteria, MessageService>  implements OnInit {

    fileName = 'Message';

     yesOrNoReplied :any[] =[];
  
    constructor(messageService: MessageService) {
        super(messageService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    this.yesOrNoReplied =  [{label: 'Replied', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    }

    public async loadMessages(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Message', 'list');
        isPermistted ? this.service.findAll().subscribe(messages => this.items = messages,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'idEmeteur', header: 'Id emeteur'},
            {field: 'idDestinataire', header: 'Id destinataire'},
            {field: 'dateEnvoi', header: 'Date envoi'},
            {field: 'replied', header: 'Replied'},
        ];
    }



	public initDuplicate(res: MessageDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Id emeteur': e.idEmeteur ,
                 'Id destinataire': e.idDestinataire ,
                 'Message': e.message ,
                'Date envoi': this.datePipe.transform(e.dateEnvoi , 'dd/MM/yyyy hh:mm'),
                'Replied': e.replied? 'Vrai' : 'Faux' ,
            }
        });

        this.criteriaData = [{
            'Id emeteur Min': this.criteria.idEmeteurMin ? this.criteria.idEmeteurMin : environment.emptyForExport ,
            'Id emeteur Max': this.criteria.idEmeteurMax ? this.criteria.idEmeteurMax : environment.emptyForExport ,
            'Id destinataire Min': this.criteria.idDestinataireMin ? this.criteria.idDestinataireMin : environment.emptyForExport ,
            'Id destinataire Max': this.criteria.idDestinataireMax ? this.criteria.idDestinataireMax : environment.emptyForExport ,
            'Message': this.criteria.message ? this.criteria.message : environment.emptyForExport ,
            'Date envoi Min': this.criteria.dateEnvoiFrom ? this.datePipe.transform(this.criteria.dateEnvoiFrom , this.dateFormat) : environment.emptyForExport ,
            'Date envoi Max': this.criteria.dateEnvoiTo ? this.datePipe.transform(this.criteria.dateEnvoiTo , this.dateFormat) : environment.emptyForExport ,
            'Replied': this.criteria.replied ? (this.criteria.replied ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
        }];
      }
}
