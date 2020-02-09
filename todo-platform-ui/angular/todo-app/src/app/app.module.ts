import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import { HttpClientModule } from '@angular/common/http';
import { APP_BASE_HREF } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import {
  MatAutocompleteModule,
  MatButtonModule,
  MatButtonToggleModule,
  MatCardModule,
  MatCheckboxModule,
  MatChipsModule,
  MatDialogModule,
  MatExpansionModule,
  MatGridListModule,
  MatIconModule,
  MatInputModule,
  MatListModule,
  MatMenuModule,
  MatNativeDateModule,
  MatPaginatorModule,
  MatProgressBarModule,
  MatProgressSpinnerModule,
  MatRadioModule,
  MatRippleModule,
  MatSelectModule,
  MatSidenavModule,
  MatSliderModule,
  MatSlideToggleModule,
  MatSnackBarModule,
  MatSortModule,
  MatTableModule,
  MatTabsModule,
  MatToolbarModule,
  MatTooltipModule,
  MatStepperModule,
} from '@angular/material';
import { MatDatepickerModule } from '@angular/material/datepicker';

// import the feature module here so you can add it to the imports array below
import { ToDoAdminModule } from './to-do-admin/to-do-admin.module';

import { AppComponent } from './app.component';

import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';
import { FixedpluginModule} from './shared/fixedplugin/fixedplugin.module';
import { AdminLayoutComponent } from './layouts/admin/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth/auth-layout.component';

import { AppRoutes } from './app.routing';
import { CreateAccountComponent } from './todo/todo-main/todo-core/services/crud/account/create-account/create-account.component';
import { EditAccountComponent } from './todo/todo-main/todo-core/services/crud/account/edit-account/edit-account.component';
import { ListAccountComponent } from './todo/todo-main/todo-core/services/crud/account/list-account/list-account.component';
import { CreateUserComponent } from './todo/todo-main/todo-core/services/crud/account/create-user/create-user.component';
import { EditUserComponent } from './todo/todo-main/todo-core/services/crud/account/edit-user/edit-user.component';
import { ListUserComponent } from './todo/todo-main/todo-core/services/crud/account/list-user/list-user.component';
import { CreateProjectComponent } from './todo/todo-main/todo-core/services/crud/task/create-project/create-project.component';
import { EditProjectComponent } from './todo/todo-main/todo-core/services/crud/task/edit-project/edit-project.component';
import { ListProjectComponent } from './todo/todo-main/todo-core/services/crud/task/list-project/list-project.component';
import { CreateTaskComponent } from './todo/todo-main/todo-core/services/crud/task/create-task/create-task.component';
import { EditTaskComponent } from './todo/todo-main/todo-core/services/crud/task/edit-task/edit-task.component';
import { ListTaskComponent } from './todo/todo-main/todo-core/services/crud/task/list-task/list-task.component';

@NgModule({
  exports: [
    MatAutocompleteModule,
    MatButtonModule,
    MatButtonToggleModule,
    MatCardModule,
    MatCheckboxModule,
    MatChipsModule,
    MatStepperModule,
    MatDatepickerModule,
    MatDialogModule,
    MatExpansionModule,
    MatGridListModule,
    MatIconModule,
    MatInputModule,
    MatListModule,
    MatMenuModule,
    MatNativeDateModule,
    MatPaginatorModule,
    MatProgressBarModule,
    MatProgressSpinnerModule,
    MatRadioModule,
    MatRippleModule,
    MatSelectModule,
    MatSidenavModule,
    MatSliderModule,
    MatSlideToggleModule,
    MatSnackBarModule,
    MatSortModule,
    MatTableModule,
    MatTabsModule,
    MatToolbarModule,
    MatTooltipModule
  ],
  declarations: [CreateAccountComponent, EditAccountComponent, ListAccountComponent, CreateUserComponent, EditUserComponent, ListUserComponent, CreateProjectComponent, EditProjectComponent, ListProjectComponent, CreateTaskComponent, EditTaskComponent, ListTaskComponent]
})
export class MaterialModule {}

@NgModule({
    imports:      [
        CommonModule,
        BrowserAnimationsModule,
        FormsModule,
        RouterModule.forRoot(AppRoutes,{
          useHash: true
        }),
        HttpModule,
        HttpClientModule,
        MaterialModule,
        MatNativeDateModule,
        SidebarModule,
        NavbarModule,
        FooterModule,
        FixedpluginModule,
        ToDoAdminModule
    ],
    declarations: [
        AppComponent,
        AdminLayoutComponent,
        AuthLayoutComponent
    ],
    bootstrap:    [ AppComponent ]
})
export class AppModule { }
