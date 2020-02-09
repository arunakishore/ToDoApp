import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccountsComponent } from './accounts/accounts.component';
import { UsersComponent } from './users/users.component';
import { AccountUsersComponent } from './account-users/account-users.component';
import { ProjectsComponent } from './projects/projects.component';

@NgModule({
  declarations: [AccountsComponent, UsersComponent, AccountUsersComponent, ProjectsComponent],
  imports: [
    CommonModule
  ],
  exports: [
    AccountsComponent,
    UsersComponent,
    AccountUsersComponent,
    ProjectsComponent
  ]
})
export class ToDoAdminModule { }
