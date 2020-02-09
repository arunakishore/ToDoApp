import { OnInit, Input } from '@angular/core';
import { Observable } from 'rxjs';
import { BaseDomain } from '../../domain/basedomain';
import { FormGroup } from '@angular/forms';

export class AppCrudService implements OnInit {

  @Input() public domainFormGroup: FormGroup;
  baseDomainItems: Observable<BaseDomain[]>;
  apiName: string;

  ngOnInit() {

  }

  create() {

  }

  update() {

  }

  deleteDomainUsingPk() {

  }

  deleteAll() {

  }

  getDomainUsingPk() {

  }


}