create table Intranet_Attendance (
	id_ LONG not null primary key,
	userId LONG,
	shouldAttendance DOUBLE,
	actualAttendance DOUBLE,
	attendanceYear LONG,
	attendanceMonth LONG,
	status INTEGER,
	approver LONG,
	createUserId LONG,
	createDate DATE null,
	modifiedUserId LONG,
	modifiedDate DATE null
);

create table Intranet_BasicInformation (
	id_ LONG not null primary key,
	userId LONG,
	name VARCHAR(75) null,
	sex INTEGER,
	idNumber VARCHAR(75) null,
	nation VARCHAR(75) null,
	placeOfOrigin VARCHAR(75) null,
	accountProperties VARCHAR(75) null,
	birthDate DATE null,
	maritalStatus VARCHAR(75) null,
	highestDegree VARCHAR(75) null,
	politicalBackground VARCHAR(75) null,
	fileLocation VARCHAR(75) null,
	basePay DOUBLE,
	performancePay DOUBLE,
	health VARCHAR(75) null,
	contactPhone VARCHAR(75) null,
	mail VARCHAR(75) null,
	domicile VARCHAR(75) null,
	residencePhone VARCHAR(75) null,
	currentResidentialAddress VARCHAR(75) null,
	currentResidentialAddressPhone VARCHAR(75) null,
	emergencyContact VARCHAR(75) null,
	emergencyContactRelation VARCHAR(75) null,
	emergencyContactPhone VARCHAR(75) null,
	isLeave INTEGER,
	departmentId LONG,
	createUserId LONG,
	createDate DATE null,
	modifiedUserId LONG,
	modifiedDate DATE null
);

create table Intranet_Department (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	leader LONG,
	createUserId LONG,
	createDate DATE null,
	modifiedUserId LONG,
	modifiedDate DATE null
);

create table Intranet_Education (
	id_ LONG not null primary key,
	userId LONG,
	eWitness VARCHAR(75) null,
	eProfessional VARCHAR(75) null,
	eUniversity VARCHAR(75) null,
	eContactPhone VARCHAR(75) null,
	eStartTimeYear VARCHAR(75) null,
	eStartTimeMonth VARCHAR(75) null,
	eStopTimeYear VARCHAR(75) null,
	eStopTimeMonth VARCHAR(75) null
);

create table Intranet_ExtInformation (
	id_ LONG not null primary key,
	userId LONG,
	openCity VARCHAR(75) null,
	bankName VARCHAR(75) null,
	bankId VARCHAR(75) null,
	laborContractStart DATE null,
	laborContractEnd DATE null,
	probationPeriodStart DATE null,
	probationPeriodEnd DATE null,
	induredLocation VARCHAR(75) null,
	fristInsuredYear VARCHAR(75) null,
	fristInsuredMonth VARCHAR(75) null,
	isInsured VARCHAR(75) null,
	basicWage LONG,
	otherWage LONG
);

create table Intranet_FamilyRelationship (
	id_ LONG not null primary key,
	userId LONG,
	frName VARCHAR(75) null,
	frRelationship VARCHAR(75) null,
	frWorkUnit VARCHAR(75) null,
	frContactPhone VARCHAR(75) null,
	frOnceJob VARCHAR(75) null
);

create table Intranet_Overtime (
	id_ LONG not null primary key,
	userId LONG,
	usuallyOvertime DOUBLE,
	restOvertime DOUBLE,
	legalOvertime DOUBLE,
	overtimeYear LONG,
	overtimeMonthly LONG,
	status INTEGER,
	approver LONG,
	createUserId LONG,
	createDate DATE null,
	modifiedUserId LONG,
	modifiedDate DATE null
);

create table Intranet_Wages (
	id_ LONG not null primary key,
	userId LONG,
	wageName VARCHAR(75) null,
	distributionMonth LONG,
	distributionYear LONG,
	entryDate DATE null,
	departureDate DATE null,
	userWage DOUBLE,
	userPerformance DOUBLE,
	userTotalWage DOUBLE,
	attendance DOUBLE,
	realAttendance DOUBLE,
	basePay DOUBLE,
	overtimeWages DOUBLE,
	performanceScores DOUBLE,
	performanceSalary DOUBLE,
	allowance DOUBLE,
	totalWages DOUBLE,
	socialCompanyBearPart DOUBLE,
	socialIndividualsBearPart DOUBLE,
	taxableIncome DOUBLE,
	taxRate DOUBLE,
	taxes DOUBLE,
	realWages DOUBLE,
	createUserId LONG,
	createDate DATE null,
	modifiedUserId LONG,
	modifiedDate DATE null
);

create table Intranet_WorkExperience (
	id_ LONG not null primary key,
	userId LONG,
	weWitness VARCHAR(75) null,
	weOnceJob VARCHAR(75) null,
	weWorkUnit VARCHAR(75) null,
	weContactPhone VARCHAR(75) null,
	weStartTimeYear VARCHAR(75) null,
	weStartTimeMonth VARCHAR(75) null,
	weStopTimeYear VARCHAR(75) null,
	weStopTimeMonth VARCHAR(75) null
);