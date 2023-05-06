import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {MessageService} from 'src/app/controller/service/Message.service';
import {MessageDto} from 'src/app/controller/model/Message.model';
import {MessageCriteria} from 'src/app/controller/criteria/MessageCriteria.model';
@Component({
  selector: 'app-message-create-admin',
  templateUrl: './message-create-admin.component.html'
})
export class MessageCreateAdminComponent extends AbstractCreateController<MessageDto, MessageCriteria, MessageService>  implements OnInit {




    constructor( private messageService: MessageService ) {
        super(messageService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }










}
