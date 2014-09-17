create index IX_AD0B1F69 on Intranet_Attendance (userId);
create index IX_EAA6EB8B on Intranet_Attendance (userId, attendanceMonthly);

create index IX_416FE1F9 on Intranet_BasicInformation (isLeave);
create index IX_D2312E5E on Intranet_BasicInformation (userId);

create index IX_6E5FE17 on Intranet_Department (name);

create index IX_990B9DE8 on Intranet_Education (userId);

create index IX_E80C2E4B on Intranet_ExtInformation (userId);

create index IX_FDF8007C on Intranet_FamilyRelationship (userId);

create index IX_1AE3AC21 on Intranet_Overtime (userId);
create index IX_D6A5EB5B on Intranet_Overtime (userId, overtimeMonthly);

create index IX_E6C4BACB on Intranet_Wages (userId);
create index IX_9B787C61 on Intranet_Wages (userId, distributionMonth);

create index IX_B797115B on Intranet_WorkExperience (userId);