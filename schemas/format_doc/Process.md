# EcoSpold01 Schema Documentation

Namespace: `http://www.EcoInvent.org/EcoSpold01`

## Dataset

a dataset describes LCI related information of a unit process or a terminated system comprising metaInformation (description of the process) and flowData (quantified inputs and outputs and allocation factors, if any).

## Meta information

meta information contains information about the process (its name, (functional) unit, classification, technology, geography, time, etc.), about modelling assumptions and validation details and about dataset administration (version number, kind of dataset, language).

## Process information

Contains content-related metainformation for the unit process.

## Reference function

Contains the identifying information of a dataset including name (english and german), unit, classification (category, subCategory), etc..

### `datasetRelatesToProduct`

- SpoldID: 400
- Type: Yes/No
- Size: 1
- Multiple occurences: No
- Required: Yes

Indicates whether the dataset relates to a process/service or not.

In the ecoinvent quality network the value required is 'yes' for unit processes and multioutput processes and 'no' for elementary flows and impact categories.

### `name`

- SpoldID: 401
- Type: Text
- Size: 80
- Multiple occurences: No
- Required: Yes

Name of the unit process, elementary flow or impact category.

For unit processes and system terminated name is used as the identifying entry together with unit, location and infrastructureProcess (yes/no). The process name is structured as follows (quality guidelines of ecoinvent 2000): 1. Name of product/service, production process or worked product, level of processing; 2. additional descriptions, separated by comma: sum formula, site of production or provenience, company, imports included or not; 3. Location in the value added chain (at plant, at regional storehouse), or destination (for wastes: to sanitary landfill, to municipal incineration) always using "at" and "to", respectively.

For elementary flows name, unit, category and subCategory are used as the discriminating elements. The nomenclature of the SETAC WG 'Data quality and data availability' is used for elementary flows as far as possible.

For impact categories, name, location, unit, category and subCategory are used as discriminating elements. The naming of impact categories takes pattern from the corresponding original publication.

English is the default language in the ecoinvent quality network.

### `localName`

- SpoldID: 490
- Type: Text
- Size: 80
- Multiple occurences: No
- Required: Yes

see 'name' for explanations.

German is the default local language in the ecoinvent quality network.

### `infrastructureProcess`

- SpoldID: 493
- Type: Yes/No
- Size: 1
- Multiple occurences: No
- Required: Yes

Indicates whether the process is an investment or an operation process. Investment processes are for instance building of a nuclear power plant, a road, docks, construction of production machinery which deliver as the output a nuclear power plant, a km road, one seaport, and production machinery respectively. It is used as a discriminating element for the identification of processes.

Not applicable for elementary flows and impact categories.

### `amount`

- SpoldID: 404
- Type: Number (Real)
- Size: s.n.
- Multiple occurences: No
- Required: Yes

Indicates the amount of reference flow (product/service, elementary flow, impact category).

Within the ecoinvent quality network the amount of the reference flow always equals 1.

### `unit`

- SpoldID: 403
- Type: Text
- Size: 20
- Multiple occurences: No
- Required: Yes

For unit processes (and systems terminated) it is the unit to which all inputs and outputs of the unit process are related to (functional unit).

For elementary flows it is the unit in which exhanges are reported.

For impact categories, it is the unit in which characterisation, damage or weighting factors are expressed.

SI-units are preferred. The units are always expressed in English language.

### `category`

- SpoldID: 495
- Type: Text
- Size: 40
- Multiple occurences: No
- Required: Yes

Category is used to structure the content of the database (together with SubCategory). It is not required for the identification of a process (processes in different categories/subCategories may therefore not be named identically). But it is required for the identification of elementary flows and impact categories. Categories are administrated centrally.

English is the default language in the ecoinvent quality network.

### `subCategory`

- SpoldID: 496
- Type: Text
- Size: 40
- Multiple occurences: No
- Required: Yes

SubCategory is used to further structure the content of the database (together with category). It is not required for the identification of a process (processes in different categories/subCategories may therefore not be named identically). But it is required for the identification of elementary flows and impact categories. SubCategories are administrated centrally.

English is the default language in the ecoinvent quality network.

### `localCategory`

- SpoldID: 497
- Type: Text
- Size: 40
- Multiple occurences: No
- Required: Yes

See category for explanations. German is the default local language in the ecoinvent quality network.

### `localSubCategory`

- SpoldID: 498
- Type: Text
- Size: 40
- Multiple occurences: No
- Required: Yes

See subCategory for explanations. German is the default local language in the ecoinvent quality network.

### `includedProcesses`

- SpoldID: 402
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Contains a description of the (sub-)processes which are combined to form one unit process (e.g., 'operation of heating system' including operation of boiler unit, regulation unit and circulation pumps). Such combination may be necessary because of lack of detailedness in available data or because of data confidentiality. As far as possible and feasible, data should however be reported on the level of detail it has been received.

Not applicable for elementary flows and impact categories.

### `generalComment`

- SpoldID: 492
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Free text for general information about the dataset. It may contain information about:

- the intended application of the dataset

- information sources used

- data selection principles

- modelling choices (exclusion of intermediate product flows, processes, allocation if done before entering into database).

### `infrastructureIncluded`

- SpoldID: 494
- Type: Yes/No
- Size: 1
- Multiple occurences: No
- Required: Yes

Indicates whether the unit process imported into the database on the basis of an LCI result (received as cumulative mass- and energy-flows, hence, no LCI results will be calculated for such processes) has included infrastructure processes or not. For all other unit process raw data data sets this data field is empty.

After calculation of LCI results in ecoinvent, the data field is filled in according to the fact, whether or not infrastructure has been including during the calculation.

Not applicable for elementary flows and impact categories.

### `CASNumber`

- SpoldID: 502
- Type: String
- Size: 11
- Options: zero fill from front
- Multiple occurences: No
- Required: No

Indicates the number according to the Chemical Abstract Service (CAS). The Format of the CAS-number: 000000-00-0, where the first string of digits needs not to be complete (i.e. less than six digits are admitted).

Not applicable for impact categories.

### `statisticalClassification`

- SpoldID: 501
- Type: Number (Long)
- Size: 8
- Options: zero fill from back
- Multiple occurences: No
- Required: No

Contains the EU-classification system (NACE code). For the first edition of the ecoinvent database this data field will not be used.

Not applicable for elementary flows and impact categories.

### `formula`

- SpoldID: 499
- Type: Text
- Size: 40
- Multiple occurences: No
- Required: No

Chemical formula (e.g. sum formula) may be entered. No graphs are allowed to represent chemical formulas.

Not applicable for impact categories.

### `synonym`

- SpoldID: 491
- Type: Text
- Size: 80
- Multiple occurences: Yes
- Required: No

Synonyms for the name, localName. In the Excel editor they are separated by two slashes ('//').

Synonyms are a subset of referenceFunction. 0..n entries are allowed with a max. length of 80 each.

## Geography

Contains information about the geographic validity of the process. The region described with regional code and free text is the market area of the product / service at issue and not necessarily the place of production.

### `location`

- SpoldID: 662
- Type: Text
- Size: 7
- Multiple occurences: No
- Required: Yes

7 letter regional code (capital letters). List of 2 letter ISO country codes extended by codes for regions, continents, market areas, and organisations and companies. The location code indicates the supply area of a product/service and the area of validity of impact assessment methods and impact categories, respectively. It does NOT necessarily coincide with the area/site of production or provenience. If supply and production area differ, production area is indicated in the name of the unit process.

### `text`

- SpoldID: 663
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Free text for further explanation. Text comprises additional aspects of the location, namely whether:

- certain areas are exempted from the location indicated,

- data are only valid for certain regions within the location indicated.

- certain elementary flows or intermediate product flows are extrapolated from another geographical area than indicated.

Extrapolations should be reported under 'representativeness'.

## Technology

Contains a description of the technology for which flow data have been collected. Free text can be used. Pictures, graphs and tables are not allowed. The text should cover information necessary to identify the properties and particularities of the technology(ies) underlying the process data.

### `text`

- SpoldID: 692
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: Yes

Describes the technological properties of the unit process. If the process comprises several subprocesses, the corresponding technologies should be reported as well. Professional nomenclature should be used for the description.

The description helps the user to judge the technical suitability of the process dataset for his or her application (purpose).

No graphs, figures or tables are allowed in this text field.

It should be stated if data for certain elementary flows or intermediate product flows are derived from different technology.

## Timeperiod

Contains all possible date-formats applicable to describe start and end date of the time period for which the dataset is valid.

### `dataValidForEntirePeriod`

- SpoldID: 603
- Type: Yes/No
- Size: 1
- Multiple occurences: No
- Required: Yes

Indicates whether or not the process data (elementary and intermediate product flows reported under flow data) are valid for the entire time period stated. If not, explanations may be given under 'text'.

### `text`

- SpoldID: 611
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Additional explanations concerning the temporal validity of the flow data reported. It may comprise information about:

- how strong the temporal correlation is for the unit process at issue (e.g., are four year old data still adequate for the process operated today?),

- why data is not valid for the entire period,

- for which smaller periods data are valid,

- whether for certain elementary and intermediate product flows a different time period is valid.

The fact that data are based on forecasts should be reported under 'representativeness'.

### `startDate`

- SpoldID: 601
- Type: Date
- Size: 10
- Multiple occurences: No
- Required: Yes

Start date of the time period for which the dataset is valid, presented as a complete date (year-month-day).

StartDate may as well be entered as year (0000) or year-month (0000-00) only. 2000 and 2000-01 means: from 01.01.2000.

If it is only known that data is older than a certain data, 'startDate' is left blank.

### `endDate`

- SpoldID: 602
- Type: Date
- Size: 10
- Multiple occurences: No
- Required: Yes

End date of the time period for which the dataset is valid, presented as a complete date (year-month-day).

EndDate may as well be entered as year (0000) or year-month (0000-00) only. 2000 and 2000-12 means: until 31.12.2000.

## Dataset Information

Contains the administrative information about the dataset at issue: type of dataset (unit process, elementary flow, impact category, multi-output process) timestamp, version and internalVersion number as well as language and localLanguage code.

### `type`

- SpoldID: 201
- Type: Number (Integer)
- Size: 1
- Options: 0=System non-terminated;1=Unit process;2=System terminated;3=Elementary Flow;4=Impact Category;5=Multioutput process
- Multiple occurences: No
- Required: Yes

Indicates the kind of data that is represented by this dataset. The code is: 0=System non-terminated. 1=Unit process. 2=System terminated. 3=Elementary flow. 4=Impact category.5=Multioutput process.

'Unit process' contains the description of processes and their direct (in situ) elementary flows (emissions and resource consumption) and intermediate product flows (demand for energy carriers, waste treatment and transport services, working materials, etc.), so-called unit process raw data. Data that arrives at the ecoinvent database in the form of life cycle inventory results are nevertheless classified as unit process.

'System non-terminated' is not used in the ecoinvent quality network.

'System terminated' contains the cumulative elementary flows (i.e. the life cycle inventory result) of a unit process. This code is only used for datasets calculated within the ecoinvent database (LCI results).

'Elementary flow' contains the definition of pollutants and of resources.

'Impact category' contains the definition of the characterisation, damage or weighting factors of life cycle impact assessment methods.

'Multioutput process' is a special kind of unit process, which delivers more than one product/service output.

### `impactAssessmentResult`

- SpoldID: 208
- Type: Boolean
- Size: 1
- Options: Yes/No
- Multiple occurences: No
- Required: Yes

Indicates whether or not (yes/no) the dataset contains the results of an impact assessment applied on unit processes (unit process raw data) or terminated systems (LCI results).

### `timestamp`

- SpoldID: 204
- Type: DateTime
- Size: 16
- Options: Time of last editing of dataset
- Multiple occurences: No
- Required: Yes

Automatically generated date when dataset is created.

### `version`

- SpoldID: 202
- Type: Number (Decimal)
- Size: 2.2
- Multiple occurences: No
- Required: Yes

The ecoinvent version number is used as follows: with a major update (e.g. every second year) the version number is increased by one (1.00, 2.00, etc.). The digits after the decimal point (e.g., 1.01, 1.02, etc.) are used for minor updates (corrected errors) within the period of two major updates. The version number is placed manually.

### `internalVersion`

- SpoldID: 207
- Type: Number (Decimal)
- Size: 2.2
- Multiple occurences: No
- Required: Yes

The internalVersion number is used to discern different versions during the working period until the dataset is entered into the database). The internalVersion is generated automatically with each change made in the dataset or related file.

### `energyValues`

- SpoldID: 203
- Type: Number (Byte)
- Size: 1
- Options: 0=Undefined1=Net values2=Gross values
- Multiple occurences: No
- Required: Yes

Indicates the way energy values are used and applied in the dataset. The codes are: 0=Undefined. 1=Net values. 2=Gross values.

This data field is by default set to 0 and not actively used in ecoinvent quality network.

### `languageCode`

- SpoldID: 205
- Type: Text
- Size: 2
- Multiple occurences: No
- Required: Yes

2 letter ISO language codes are used. Default language is English. Lower case letters are used.

### `localLanguageCode`

- SpoldID: 206
- Type: Text
- Size: 2
- Multiple occurences: No
- Required: Yes

2 letter ISO language codes are used. Default localLanguage is German. Lower case letters are used.

## Modelling and validation

Contains metainformation about how unit processes are modelled and about the review/validation of the dataset.

## Representativeness

Contains information about the fraction of the relevant market supplied by the product/service described in the dataset. Information about market share, production volume (in the ecoinvent quality network: also consumption volume in the market area) and information about how data have been sampled.

### `percent`

- SpoldID: 722
- Type: Number(Decimal)
- Size: 3.1
- Options: Maximum 100
- Multiple occurences: No
- Required: No

Indicates the share in market supply in the geographical area indicated of the product/service at issue.

If data representative for a process operated in one country is used for another country's process, the entry should be '0'. The representativity for the original country is reported under 'extrapolations'.

### `productionVolume`

- SpoldID: 724
- Type: Text
- Size: 80
- Multiple occurences: No
- Required: No

Indicates the market area consumption volume (NOT necessarily identical with the production volume) in the geographical area indicated of the product/service at issue.

The market volume should be given in absolute terms per year and in common units. It is related to the time period specified elsewhere.

### `samplingProcedure`

- SpoldID: 725
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Indicates the sampling procedure applied for quantifying the exchanges. It should be reported whether the sampling procedure for particular elementary and intermediate product flows differ from the general procedure. Possible problems in combining different sampling procedures should be mentioned.

### `extrapolations`

- SpoldID: 726
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Describes extrapolations of data from another time period, another geographical area or another technology and the way these extrapolations have been carried out.

It should be reported whether different extrapolations have been done on the level of individual exchanges.

If data representative for a process operated in one country is used for another country's process, its original representativity can be indicated here.

Changes in mean values due to extrapolations may also be reported here.

### `uncertaintyAdjustments`

- SpoldID: 727
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

For datasets where the additional uncertainty from lacking representativeness has been included in the quantified uncertainty values ('minValue' and 'maxValue'), thus raising the value in 'percent' of the dataset to 100%, this field also reports the original representativeness, the additional uncertainty and the procedure by which it was assessed or calculated.

## Source

Contains information about author(s), title, kind of publication, place of publication, name of editors (if any), etc..

### `number`

- SpoldID: 801
- Type: Number (Integer)
- Size: 3
- Multiple occurences: Yes
- Required: Yes

ID number to identify the source within one dataset.

### `sourceType`

- SpoldID: 802
- Type: Number (Byte)
- Size: 1
- Options: 0=Undefined (default)1=Article2=Chapters in anthology3=Separate publication4=Measurement on site5=Oral communication6=Personal written communication7=Questionnaries
- Multiple occurences: Yes
- Required: Yes

Indicates the kind of source.

The codes are: 0=Undefined (default). 1=Article. 2=Chapters in anthology. 3=Seperate publication. 4=Measurement on site. 5=Oral communication. 6=Personal written communication. 7=Questionnaries.

### `firstAuthor`

- SpoldID: 1002
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes

Indicates the first author by surname and abbreviated name (e.g., Einstein A.). In case of measurement on site, oral communication, personal written communication and questionnaries ('sourceType'=4, 5, 6, 7) the name of the communicating person is mentioned here.

Identifies the source together with 'title' and 'year'.

### `additionalAuthors`

- SpoldID: 1003
- Type: Text
- Size: 255
- Multiple occurences: Yes
- Required: No

List of additional authors (surname and abbreviated name, e.g. Newton I.), separated by commas. 'Et al.' may be used, if more than five additonal authors contributed to the cited publication.

### `year`

- SpoldID: 1004
- Type: Number (Integer)
- Size: 4
- Multiple occurences: Yes
- Required: Yes

Indicates the year of publication and communication, respectively.

Identifies the source together with 'firstAuthor' and 'title'.

### `title`

- SpoldID: 1005
- Type: Text
- Size: 32000
- Multiple occurences: Yes
- Required: Yes

Contains the complete title of the publication.

Measurement on site: write "Measurement documentation of company XY".

Oral communication: write "Oral communication, company XY".

Personal written communication: write: "personal written communication, Mr./Mrs. XY, company Z".

Questionnaires: write "Questionnaire, filled in by Mr./Mrs. XY, company Z".

Identifies the source together with 'firstAuthor' and 'year'.

### `pageNumbers`

- SpoldID: 1006
- Type: Text
- Size: 15
- Multiple occurences: No
- Required: No

If an article or a chapter in an anthology, list the relevant page numbers. In case of separate publications the total number of pages may be entered.

### `nameOfEditors`

- SpoldID: 1007
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: No

Contains the names of the editors (if any).

### `titleOfAnthology`

- SpoldID: 1008
- Type: Text
- Size: 255
- Multiple occurences: Yes
- Required: No

If the publication is a chapter in an anthology, the title of the anthology is reported here.

For the reports of the ecoinvent quality network 'Final report ecoinvent 2000' is written here.

### `placeOfPublications`

- SpoldID: 1009
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes

Indicates the place(s) of publication. In case of measurements on site, oral communication, personal written communication or questionnaires, it is the location of the company which provided the information. If available via the web add the web-address.

For the ECOINVENT final reports 'EMPA D�bendorf' is written.

### `publisher`

- SpoldID: 1010
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: No

Lists the name of the publisher (if any).

In case of the ecoinvent quality network it is the 'Swiss Centre for Life Cycle Inventories'.

### `journal`

- SpoldID: 1011
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: No

Indicates the name of the journal an article is published in.

### `volumeNo`

- SpoldID: 1012
- Type: Number (Integer)
- Size: 3
- Multiple occurences: Yes
- Required: No

Indicates the volume of the journal an article is published in.

### `issueNo`

- SpoldID: 1013
- Type: String
- Size: 40
- Multiple occurences: Yes
- Required: No

Indicates the issue number of the journal an article is published in.

### `text`

- SpoldID: 803
- Type: Text
- Size: 32000
- Multiple occurences: Yes
- Required: No

Free text for additional description of the source. It may contain a brief summary of the publication and the kind of medium used (e.g. CD-ROM, hard copy)

## Validation

Contains information about who carried out the critical review and about the main results and conclusions of the review and the recommendations made.

### `proofReadingDetails`

- SpoldID: 5615
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: Yes

Contains the comment of the reviewer of the dataset. For the ecoinvent quality network the review text should cover the following items: 1. completeness and transparency of the documentation, 2. conformity with the ecoinvent quality guidelines, 3. plausibility of the data (unit process elementary and intermediate product flows), 4. completeness regarding elementary and intermediate product flows, 5. mathematical correctness. The review is limited to sample audits (not covering each and every figure).

### `proofReadingValidator`

- SpoldID: 5616
- Type: Number (Integer)
- Size: 2
- Options: Reference to 5800
- Multiple occurences: No
- Required: Yes

Indicates the person who carried out the review. ID number must correspond to an ID number of a person listed in the respective dataset.

### `otherDetails`

- SpoldID: 5619
- Type: Text
- Size: 32000
- Multiple occurences: No
- Required: No

Contains further information from the review process, especially comments received from third parties once the dataset has been published.

## Administrative information

Contains the administrative information about the dataset at issue: type of dataset (unit process, elementary flow, impact category, multi-output process) timestamp, version and internalVersion number as well as language and localLanguage code.

## Data entry by

Contains information about the person that entered data in the database or transformed data into the format of the ecoinvent (or any other) quality network.

### `person`

- SpoldID: 302
- Type: Number (Integer)
- Size: 2
- Options: Entry must be identical to an existing entry in field 5800
- Multiple occurences: No
- Required: Yes

ID number for the person that prepared the dataset and enters the dataset into the database. It must correspond to an ID number of a person listed in the respective dataset.

### `qualityNetwork`

- SpoldID: 304
- Type: Integer
- Size: 1
- Options: 1=ecoinvent
- Multiple occurences: No
- Required: Yes

Indicates a project team that works on the database. The information is used, e.g., for restricting the accessibility of dataset information to one particular quality network. The code used is: 1=ecoinvent

## Data generator and publication

Contains information about who compiled for and entered data into the database. Furthermore contains information about kind of publication underlying the dataset and the accessibility of the dataset.

### `person`

- SpoldID: 751
- Type: Number (Integer)
- Size: 2
- Options: Entry must be identical to an existing entry in field 5800
- Multiple occurences: No
- Required: Yes

ID number for the person that generated the dataset. It must correspond to an ID number of a person listed in the respective dataset.

### `dataPublishedIn`

- SpoldID: 756
- Type: Number (Byte)
- Size: 1
- Options: 0= Data as such not published elsewhere, 1= The data of some unit processes or subsystems are published, 2= Data has been published entirely in (refers to field 757) (default)
- Multiple occurences: No
- Required: Yes

Indicates whether the dataset has been published (not, partly, entirely).

The codes are: 0=Data as such not published (default). 1=The data of some unit processes or subsystems are published. 2=Data has been published entirely in 'referenceToPublishedSource'.

Within the ecoinvent quality network all datasets are published in the series of ecoinvent reports.

### `referenceToPublishedSource`

- SpoldID: 757
- Type: Number (Integer)
- Size: 3
- Options: Reference to 801
- Multiple occurences: No
- Required: No; Yes if 756 = 2

ID number for the report in which the dataset is documented. It must correspond to an ID number of a source listed in the respective dataset.

### `copyright`

- SpoldID: 758
- Type: Yes/No
- Size: 1
- Multiple occurences: No
- Required: Yes

Indicates whether or not a copyright exists. '1' (Yes) or '0' (No) should be entered correspondingly.

### `accessRestrictedTo`

- SpoldID: 759
- Type: Number (Byte)
- Size: 1
- Options: 0=Public,1=ETH Domain,2=ecoinvent 2000,3=Institute
- Multiple occurences: No
- Required: No

Indicates possible access restrictions for the dataset.

The codes used are: 0=Public. 1=ETH Domain. 2=ecoinvent 2000. 3=Institute.

If access is restricted to a particular institute, 'companyCode' and 'countryCode' indicates the institute that has access to the data.

accessRestrictedTo=0: all information can be accessed by everybody

accessRestrictedTo=1, 2: ecoinvent clients have access to LCI results but not to unit process raw data. Members of the ecoinvent quality network (ecoinvent centre) have access to all information.

accessRestrictedTo=3: The ecoinvent administrator has full access to information. Via the web only LCI results are accessible (for ecoinvent clients and for members of the ecoinvent centre.

### `companyCode`

- SpoldID: 760
- Type: Text
- Size: 7
- Options: If 759=3
- Multiple occurences: No

7 letter code with which organisations/institutes that co-operate within one of the database quality networks (see also 'qualityNetwork') are characterised and identified. 'countryCode' is required additionally.

Only required and allowed if access to the dataset is restricted to a particular institute within the ecoinvent quality network.

### `countryCode`

- SpoldID: 761
- Type: Text
- Size: 2
- Options: If 759=3, ISO-Codes
- Multiple occurences: No

2 letter ISO-country codes are used to indicate the country where organisations/institutes are located which co-operate within one of the database quality networks (see also 'qualityNetwork').

Only required and allowed if access to the dataset is restricted to a particular institute within the ecoinvent quality network.

### `pageNumbers`

- SpoldID: 762
- Type: Text
- Size: 30
- Multiple occurences: No
- Required: No

Indicates the page numbers in the publication where the table with the unit process raw data, and the characterisation, damage or weighting factors of the impact category, respectively are documented.

## Person

Used for the identification of members of the organisation / institute co-operating within a quality network (e.g., ecoinvent) referred to in the areas Validation, dataEntryBy and dataGeneratorAndPublication.

### `number`

- SpoldID: 5800
- Type: Number (Integer)
- Size: 10
- Multiple occurences: Yes
- Required: Yes

ID number is attributed to each person of an organisation/institute co-operating in a quality network such as ecoinvent. It is used to identify persons cited within one dataset.

### `name`

- SpoldID: 5802
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes

Name and surname of the person working in an organisation/institute which is a member of the quality network.

Identifies the person together with 'address' (#5803).

### `address`

- SpoldID: 5803
- Type: Text
- Size: 255
- Multiple occurences: Yes
- Required: Yes

Complete address, including street, po-box (if applicable), zip-code, city, state (if applicable), country.

Identifies the person together with 'name' (#5802).

### `telephone`

- SpoldID: 5804
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes

Phone number including country and regional codes.

### `telefax`

- SpoldID: 5805
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: No

Fax number including country and regional codes.

### `email`

- SpoldID: 5806
- Type: Text
- Size: 80
- Multiple occurences: Yes
- Required: No

Complete email address.

### `companyCode`

- SpoldID: 5807
- Type: Text
- Size: 7
- Multiple occurences: Yes
- Required: Yes

7 letter company code of the organisation/institute co-operating in a quality network.

Identifies the co-operation partner together with the countryCode (#5808).

### `countryCode`

- SpoldID: 5808
- Type: Text
- Size: 2
- Options: ISO-Codes
- Multiple occurences: Yes
- Required: Yes

2 letter ISO-country code of the organisation/institute co-operating in a quality network.

Identifying the co-operation partner together with the companyCode (#5807).

## Flow data

contains information about inputs and outputs (to and from nature as well as to and from technosphere) and information about allocation (flows to be allocated, co-products to be allocated to, allocation factors).

## Exchange

Comprises all inputs and outputs (both elementary flows and intermediate product flows) recorded in a unit process and its related information.

### `number`

- SpoldID: 3793
- Type: Number (Integer)
- Size: 10
- Multiple occurences: Yes
- Required: Yes

ID number used as an identifier of a particular exchange in a dataset.

### `category`

- SpoldID: 3506
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes, if 3503=4 and/or 3504=4

Describes the category one particular exchange belongs to (in English language). Category and subCategory are required for elementary flows because they have a discriminative function.

### `subCategory`

- SpoldID: 3507
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes, if 3503=4 and/or3504=4

Describes the subCategory one particular exchange belongs to (in English language). Category and subCategory are required for elementary flows because they have a discriminative function.

### `localCategory`

- SpoldID: 3509
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes

Describes the category one particular exchange belongs to (in German local language).See further explanations in 'category'.

### `localSubCategory`

- SpoldID: 3510
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: Yes

Describes the subCategory one particular exchange belongs to (in German local language).See further explanations in 'subCategory'.

### `CASNumber`

- SpoldID: 3701
- Type: String
- Size: 11
- Multiple occurences: Yes
- Required: No

Indicates the number according to the Chemical Abstract Service (CAS). The Format of the CAS-number: 000000-00-0, where the first string of digits needs not to be complete (i.e. less than six digits are admitted).

### `name`

- SpoldID: 3702
- Type: Text
- Size: 80
- Multiple occurences: Yes
- Required: Yes

Name of the exchange (elementary flow or intermediate product flow) in English language. See 'name' in 'metaInformation/referenceFunction' for more explanations.

### `location`

- SpoldID: 3703
- Type: Text
- Size: 7
- Options: reference to 662
- Multiple occurences: Yes
- Required: Yes, if 3503!=4 and/or 3504!=4

Market area information for the intermediate product/service flow. Location is defined by a 7 letter code written with capital letters. See 'metaInformation/referenceFunction' for more explanations.

Information about the geographic area for which an impact assessment method is valid.

Not applicable for elementary flows.

### `unit`

- SpoldID: 3706
- Type: Text
- Size: 20
- Multiple occurences: Yes
- Required: Yes

Unit of the exchange (elementary flow or intermediate product flow). See 'metaInformation/referenceFunction' for more explanations.

Unit of the elementary flow for which a characterisation, damage or weighting factor is determined.

### `meanValue`

- SpoldID: 3707
- Type: Number (Single)
- Size: s.n
- Multiple occurences: Yes
- Required: Yes

Mean amount of elementary flow or intermediate product flow.

In case of triangular uncertainty distribution, the meanValue shall be calculated from the mostLikelyValue. The field mostLikelyValue (#3797) shall not be used in the ecoinvent quality network.

### `uncertaintyType`

- SpoldID: 3708
- Type: Integer
- Size: 1
- Options: 0=undefined, 1=lognormal (default), 2=normal, 3=triang, 4=uniform
- Multiple occurences: Yes
- Required: Yes

Defines the kind of uncertainty distribution applied on one particular exchange. Lognormal distribution is default, normal, triangular or uniform distribution may be chosen if appropriate.

### `standardDeviation95`

- SpoldID: 3709
- Type: Number
- Multiple occurences: Yes
- Required: No

Defines the 2.5% and the 97.5% value for the uncertainty range with normal and lognormal distribution.

For lognormal distribution the square of the geometric standard deviation (SDg^2) is entered. SDg^2 is dimensionless. MeanValue times SDg^2 equals the 97.5% value (=maxValue), meanvalue divided by SDg^2 equals the 2.5% value (=minValue).

For normal distribution the double standard deviation (2*SD) is entered. 2*SD is given in the same unit like the meanValue. MeanValue plus 2*SD equals 97.5% value (=maxValue), meanValue minus 2*SD equals 2.5% value (=minValue).

This data field remains empty when uniform or triangular uncertainty distribution is applied (uncertaintyType = 3 and 4, respectively).

### `formula`

- SpoldID: 3711
- Type: Text
- Size: 40
- Multiple occurences: Yes
- Required: No

Chemical formula (e.g. sum formula) may be entered. No graphs are allowed to represent chemical formulas.

### `referenceToSource`

- SpoldID: 3715
- Type: Number
- Size: 3
- Options: Reference to 801
- Multiple occurences: Yes
- Required: No

An ID used in the area 'sources' of the respective dataset is required. It indicates the publication (of the ecoinvent quality network) where the unit process raw data at issue and the characterisation, damage or weighting factors of an impact category, respectively, are documented.

### `pageNumbers`

- SpoldID: 3716
- Type: Text
- Size: 30
- Multiple occurences: Yes
- Required: No

The page numbers of the publication (of the ecoinvent quality network) where the exchanges of the unit process at issue are documented.

### `generalComment`

- SpoldID: 3792
- Type: Text
- Size: 32000
- Multiple occurences: Yes
- Required: No

A general comment can be made about each individual exchange (or characterisation, damage or weighting factor) of a particular unit process and impact category, respectively.

It contains the string of code numbers of the ecoinvent uncertainty assessment (if pedigree matrix is applied) as well as further comments about the uncertainty assessment.

The string of numbers of the uncertainty assessment describes (reliability, completeness, temporal correlation, geographical correlation, further technical correlation, sample size) and uses a score from 1 to 5. See methodology report for further information.

### `localName`

- SpoldID: 3794
- Type: Text
- Size: 80
- Multiple occurences: Yes
- Required: No

Name of the exchange (or characterisation, damage or weighting factor) of a particular unit process and impact category, respectively (in German local language).

### `infrastructureProcess`

- SpoldID: 3508
- Type: Yes/No
- Size: 1
- Required: Yes, if 3503=5

Describes whether the intermediate product flow from or to the unit process is an infrastructure process or not.

Not applicable to elementary flows.

### `minValue`

- SpoldID: 3795
- Type: Number (Single)
- Size: s.n.
- Options: If UncertaintyType=triangular/ uniform
- Multiple occurences: Yes
- Required: No

Contains the minimum value for exchange data with a uniform or triangular distribution.

In case of LCI results imported into the ecoinvent database, the 2.5% value is reported in this field.

### `maxValue`

- SpoldID: 3796
- Type: Number (Single)
- Size: s.n.
- Options: If UncertaintyType=triangular/ uniform
- Multiple occurences: Yes
- Required: No

Contains the maximum value for exchange data with a uniform or triangular distribution.

In case of LCI results imported into the ecoinvent database, the 97.5% value is reported in this field.

### `mostLikelyValue`

- SpoldID: 3797
- Type: Number (Single)
- Size: s.n.
- Options: If UncertaintyType=triangular
- Multiple occurences: Yes
- Required: No

In some cases the MostLikelyValue is available for exhange data with triangular distribution. However, do not use this field, but calculate the mean value, (minValue + mostLikelyValue +maxValue)/3, and enter it into the field "meanValue").

### `inputGroup`

- SpoldID: 3503
- Type: Number
- Size: 1
- Options: 1=Materials/Fuels, 2=Electricity/Heat, 3=Services, 4=FromNature, 5=FromTechnosphere
- Multiple occurences: Yes
- Required: Yes

Indicates the kind of input flow. The codes are: 1=Materials/Fuels, 2=Electricity/Heat, 3=Services, 4=FromNature, 5=FromTechnosphere.

Within the ecoinvent quality network, only 4 and 5 are actively used (any material, fuel, electricity, heat or service is classified as an input from technosphere).

### `outputGroup`

- SpoldID: 3504
- Type: Number
- Size: 1
- Options: 0=ReferenceProduct, 1=Include avoided product system, 2=Allocated by product, 3=WasteToTreatment, 4=ToNature
- Multiple occurences: Yes
- Required: Yes

Indicates the kind of output flow. The codes are: 0=ReferenceProduct, 1=Include avoided product system, 2=Allocated by product, 3=WasteToTreatment, 4=ToNature.

The options 0, 2, and 4 are actively used in the ecoinvent quality network.

Products of multioutput processes are classified as allocated by-products (2).

Avoided product systems are modelled with a negative input from technosphere. WasteToTreatment are modelled like services (hence inputFromTechnosphere). Therefore codes '1' and '3' are not required.

## Allocation

Contains all information about allocation procedure, allocation parameters and allocation factors applied on a multi-output process.

### `referenceToCoProduct`

- SpoldID: 2401
- Type: Number
- Size: 10
- Options: Reference to internal TIndexNumber
- Multiple occurences: Yes
- Required: Yes

Indicates the co-product output for which a particular allocation factor is valid. Additional information is required about the exchange on which the allocation factor is applied (see 'referenceToInputOutput').

MultipleOccurences=Yes is only valid, if referenceFunction describes a multioutput process.

### `allocationMethod`

- SpoldID: 2403
- Type: Number (Byte)
- Size: 2
- Options: -1=Undefined (default)0=Physical causality1=Economic causality2=Other method
- Multiple occurences: Yes
- Required: Yes

Indicates the kind of allocation parameter chosen. The codes are: -1=Undefined (default). 0=Physical causality. 1=Economic causality. 2=Other method. 'Other method' comprises in particular physical parameters (like mass, energy, exergy, etc.) and parameters other than economic.

MultipleOccurences=Yes only valid, if referenceFunction describes a multioutput process.

### `fraction`

- SpoldID: 2404
- Type: Number (Decimal)
- Multiple occurences: Yes
- Required: Yes

Allocation factor, expressed as a fraction (in %), applied on one particular exchange for one particular co-product. The sum of the allocation factors applied on one particular exchange must add up to 100%.

MultipleOccurences=Yes only valid, if referenceFunction describes a multioutput process.

### `explanations`

- SpoldID: 2407
- Type: Text
- Size: 32000
- Multiple occurences: Yes
- Required: No

Contains further information about the allocation procedure and the allocation parameter chosen. An eventual coincidence in allocation factors when comparing different allocation parameters (like physical and economic ones) may be reported here as well.

### `referenceToInputOutput`

- SpoldID: 2492
- Type: Number
- Size: 10
- Options: Reference to internal TIndexNumber
- Multiple occurences: Yes, multiple per Allocation
- Required: Yes

The data field is only required, if the reference function describes a multioutput process.

Lists the relation(s) to which a certain allocation factor is applied.

MultipleOccurrence=Yes on two levels: Firstly, the reference occurs per co-product and secondly, the reference occurs per input and output flows which are allocated to the co-products.
