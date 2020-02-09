import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from '../app.module';

import { AccountsComponent } from './accounts/accounts.component';
import { UsersComponent } from './users/users.component';
import { AccountUsersComponent } from './account-users/account-users.component';
import { ProjectsComponent } from './projects/projects.component';
import { ToDoComponentsRoutes } from './to-do-admin.routing';

@NgModule({
  declarations: [AccountsComponent, UsersComponent, AccountUsersComponent, ProjectsComponent],
  imports: [
    CommonModule,
    RouterModule.forChild(ToDoComponentsRoutes),
  ],
  exports: [
    AccountsComponent,
    UsersComponent,
    AccountUsersComponent,
    ProjectsComponent
  ]
})
export class ToDoAdminModule { }
