import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class MessageDto  extends BaseDto{

    public id: number;
   public idEmeteur: number;
   public idDestinataire: number;
    public message: string;
   public dateEnvoi: Date;
   public replied: null | boolean;
    public idEmeteurMax: string ;
    public idEmeteurMin: string ;
    public idDestinataireMax: string ;
    public idDestinataireMin: string ;
    public dateEnvoiMax: string ;
    public dateEnvoiMin: string ;

}
