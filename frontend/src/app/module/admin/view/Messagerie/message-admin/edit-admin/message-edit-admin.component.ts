import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {MessageService} from 'src/app/controller/service/Message.service';
import {MessageDto} from 'src/app/controller/model/Message.model';
import {MessageCriteria} from 'src/app/controller/criteria/MessageCriteria.model';



@Component({
  selector: 'app-message-edit-admin',
  templateUrl: './message-edit-admin.component.html'
})
export class MessageEditAdminComponent extends AbstractEditController<MessageDto, MessageCriteria, MessageService>   implements OnInit {






    constructor( private messageService: MessageService ) {
        super(messageService);
    }

    ngOnInit(): void {
}
    public prepareEdit() {
        this.item.dateEnvoi = this.messageService.format(this.item.dateEnvoi);
    }



    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }







}
