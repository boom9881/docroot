create index IX_AD0B1F69 on Intranet_Attendance (userId);

create index IX_D2312E5E on Intranet_BasicInformation (userId);

create index IX_990B9DE8 on Intranet_Education (userId);

create index IX_E80C2E4B on Intranet_ExtInformation (userId);

create index IX_FDF8007C on Intranet_FamilyRelationship (userId);

create index IX_1AE3AC21 on Intranet_Overtime (userId);

create index IX_14C5E488 on Intranet_Satff (uuid_);
create index IX_D93D7AA0 on Intranet_Satff (uuid_, companyId);

create index IX_E6C4BACB on Intranet_Wages (userId);

create index IX_B797115B on Intranet_WorkExperience (userId);

create index IX_C1BE5093 on Intranet_basic_information (uuid_);
create index IX_27ABA9B5 on Intranet_basic_information (uuid_, companyId);

create index IX_693BBA26 on Intranet_education (uuid_);
create index IX_27E49642 on Intranet_education (uuid_, companyId);

create index IX_1CA0C880 on Intranet_ext_information (uuid_);
create index IX_3EDEEBA8 on Intranet_ext_information (uuid_, companyId);

create index IX_5F898AAA on Intranet_family (uuid_);
create index IX_7D6E0B3E on Intranet_family (uuid_, companyId);

create index IX_507F1868 on Intranet_satff (uuid_);
create index IX_5F471AC0 on Intranet_satff (uuid_, companyId);

create index IX_58A7099D on Intranet_work (uuid_);
create index IX_5D35C66B on Intranet_work (uuid_, companyId);