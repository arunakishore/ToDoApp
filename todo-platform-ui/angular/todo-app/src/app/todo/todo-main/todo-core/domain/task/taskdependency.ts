import { BaseDomain } from '../basedomain';

export class TaskDependency extends BaseDomain {
  taskpk: number;
  dependentpk: number;
  dependenttype: string;
}