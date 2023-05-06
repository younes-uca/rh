import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {DemandeCongeService} from 'src/app/controller/service/DemandeConge.service';
import {DemandeCongeDto} from 'src/app/controller/model/DemandeConge.model';
import {DemandeCongeCriteria} from 'src/app/controller/criteria/DemandeCongeCriteria.model';

import {DepartementDto} from 'src/app/controller/model/Departement.model';
import {DepartementService} from 'src/app/controller/service/Departement.service';
import {TypeDemandeCongeDto} from 'src/app/controller/model/TypeDemandeConge.model';
import {TypeDemandeCongeService} from 'src/app/controller/service/TypeDemandeConge.service';
import {EtatDemandeCongeDto} from 'src/app/controller/model/EtatDemandeConge.model';
import {EtatDemandeCongeService} from 'src/app/controller/service/EtatDemandeConge.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
@Component({
  selector: 'app-demande-conge-view-admin',
  templateUrl: './demande-conge-view-admin.component.html'
})
export class DemandeCongeViewAdminComponent extends AbstractViewController<DemandeCongeDto, DemandeCongeCriteria, DemandeCongeService> implements OnInit {


    constructor(private demandeCongeService: DemandeCongeService, private departementService: DepartementService, private typeDemandeCongeService: TypeDemandeCongeService, private etatDemandeCongeService: EtatDemandeCongeService, private employeService: EmployeService){
        super(demandeCongeService);
    }

    ngOnInit(): void {
        this.chefRH = new ChefRHDto();
        this.chefRHService.findAll().subscribe((data) => this.chefRHs = data);
        this.chedDepartement = new ChedDepartementDto();
        this.chedDepartementService.findAll().subscribe((data) => this.chedDepartements = data);
        this.departement = new DepartementDto();
        this.departementService.findAll().subscribe((data) => this.departements = data);
        this.etatDemandeConge = new EtatDemandeCongeDto();
        this.etatDemandeCongeService.findAll().subscribe((data) => this.etatDemandeConges = data);
        this.typeDemandeConge = new TypeDemandeCongeDto();
        this.typeDemandeCongeService.findAll().subscribe((data) => this.typeDemandeConges = data);
    }


    get chefRH(): EmployeDto {
       return this.employeService.item;
    }
    set chefRH(value: EmployeDto) {
        this.employeService.item = value;
    }
    get chefRHs():Array<EmployeDto> {
       return this.employeService.items;
    }
    set chefRHs(value: Array<EmployeDto>) {
        this.employeService.items = value;
    }
    get typeDemandeConge(): TypeDemandeCongeDto {
       return this.typeDemandeCongeService.item;
    }
    set typeDemandeConge(value: TypeDemandeCongeDto) {
        this.typeDemandeCongeService.item = value;
    }
    get typeDemandeConges():Array<TypeDemandeCongeDto> {
       return this.typeDemandeCongeService.items;
    }
    set typeDemandeConges(value: Array<TypeDemandeCongeDto>) {
        this.typeDemandeCongeService.items = value;
    }
    get departement(): DepartementDto {
       return this.departementService.item;
    }
    set departement(value: DepartementDto) {
        this.departementService.item = value;
    }
    get departements():Array<DepartementDto> {
       return this.departementService.items;
    }
    set departements(value: Array<DepartementDto>) {
        this.departementService.items = value;
    }
    get chedDepartement(): EmployeDto {
       return this.employeService.item;
    }
    set chedDepartement(value: EmployeDto) {
        this.employeService.item = value;
    }
    get chedDepartements():Array<EmployeDto> {
       return this.employeService.items;
    }
    set chedDepartements(value: Array<EmployeDto>) {
        this.employeService.items = value;
    }
    get etatDemandeConge(): EtatDemandeCongeDto {
       return this.etatDemandeCongeService.item;
    }
    set etatDemandeConge(value: EtatDemandeCongeDto) {
        this.etatDemandeCongeService.item = value;
    }
    get etatDemandeConges():Array<EtatDemandeCongeDto> {
       return this.etatDemandeCongeService.items;
    }
    set etatDemandeConges(value: Array<EtatDemandeCongeDto>) {
        this.etatDemandeCongeService.items = value;
    }


}
