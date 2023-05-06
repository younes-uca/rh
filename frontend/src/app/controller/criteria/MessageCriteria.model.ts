import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class MessageCriteria  extends   BaseCriteria  {

    public id: number;
     public idEmeteur: number;
     public idEmeteurMin: number;
     public idEmeteurMax: number;
     public idDestinataire: number;
     public idDestinataireMin: number;
     public idDestinataireMax: number;
    public message: string;
    public messageLike: string;
    public dateEnvoi: Date;
    public dateEnvoiFrom: Date;
    public dateEnvoiTo: Date;
    public replied: null | boolean;

}
