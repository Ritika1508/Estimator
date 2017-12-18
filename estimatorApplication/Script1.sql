--<ScriptOptions statementTerminator="GO"/>

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE EYP_PolicyLine (
	ACCOUNTNUMBER VARCHAR(60),
	POLICYNUMBER VARCHAR(60),
	SUBTYPE VARCHAR(50),
	AggregatorType_AIT VARCHAR(50),
	AutoSymbolsManualEditDate null,
	BasedOnValue VARCHAR(64),
	BlanketType VARCHAR(50),
	BranchValue VARCHAR(64),
	BusinessVehicleAutoNumberSeq VARCHAR(64),
	CPBlanketAutoNumberSeq VARCHAR(64),
	ChangeType VARCHAR(50),
	Channel VARCHAR(50),
	ClaimsMadeOrigEffDate null,
	CreateUser VARCHAR(64),
	CreditCard VARCHAR(64),
	CustomAutoSymbolDesc VARCHAR(255),
	CustomerProfile_AIT VARCHAR(50),
	EffectiveDate null,
	EquipmentAutoNumberSeq VARCHAR(64),
	ExpirationDate null,
	Fixed VARCHAR(64),
	Fleet VARCHAR(50),
	GLCoverageForm VARCHAR(50),
	GoverningClass VARCHAR(64),
	InitCoverageBundle_AIT VARCHAR(50),
	InitialConditionsCreated BIT,
	InitialCoveragesCreated BIT,
	InitialExclusionsCreated BIT,
	LocationLimits BIT,
	ManuscriptOptionDesc VARCHAR(2147483647),
	ManuscriptPremium DECIMAL(18 , 2),
	ManuscriptPremium_cur VARCHAR(50),
	MinimumPremium VARCHAR(64),
	NumAddInsured INT,
	Origin_AIT VARCHAR(50),
	OriginalAttachDate_AIT null,
	OriginalEffectiveDate_AIT null,
	ParticipatingPlan VARCHAR(64),
	PatternCode VARCHAR(64),
	PaymentMethod VARCHAR(64),
	PaymentPeriod VARCHAR(64),
	PersonalVehicleAutoNumberSeq VARCHAR(64),
	PolicyDescription VARCHAR(1333),
	PolicyType VARCHAR(50),
	PollutionCleanupExp BIT,
	PreferredCoverageCurrency VARCHAR(50),
	Priority INT,
	ProductName VARCHAR(40),
	ReferenceDateInternal null,
	RetroactiveDate null,
	RetrospectiveRatingPlan VARCHAR(64),
	RiskFactorsSelectionCode VARCHAR(256),
	SmallBusinessType VARCHAR(50),
	SplitLimits BIT,
	StartDate_AIT null,
	TaxesReferenceDate null,
	UpdateUser VARCHAR(64),
	VehicleAutoNumberSeq VARCHAR(64),
	ViewBundledCoverages BIT,
	PublicID VARCHAR(64)
)
GO

SET ANSI_PADDING OFF
GO

