import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {MessageService} from 'src/app/controller/service/Message.service';
import {MessageDto} from 'src/app/controller/model/Message.model';
import {MessageCriteria} from 'src/app/controller/criteria/MessageCriteria.model';

@Component({
  selector: 'app-message-view-admin',
  templateUrl: './message-view-admin.component.html'
})
export class MessageViewAdminComponent extends AbstractViewController<MessageDto, MessageCriteria, MessageService> implements OnInit {


    constructor(private messageService: MessageService){
        super(messageService);
    }

    ngOnInit(): void {
    }




}
