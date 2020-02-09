import { Routes } from '@angular/router';

import { AccountUsersComponent } from './account-users/account-users.component';
import { AccountsComponent } from './accounts/accounts.component';
import { UsersComponent } from './users/users.component';
import { ProjectsComponent } from './projects/projects.component';

export const ToDoComponentsRoutes: Routes = [
    {
      path: 'todoadmin',
      children: [ 
        {
          path: 'accounts',
          component: AccountsComponent
        },
        {
          path: 'users',
          component: UsersComponent
        },
        {
          path: 'account-users',
          component: AccountUsersComponent
        },
        {
          path: 'projects',
          component: ProjectsComponent
        },
  ]}
];
