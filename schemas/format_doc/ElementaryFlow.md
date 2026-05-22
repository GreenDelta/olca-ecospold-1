# EcoSpold01 Schema Documentation

Namespace: `http://www.EcoInvent.org/EcoSpold01Elementary`

## Dataset

A dataset describes LCI related information of an elementary flow comprising metaInformation (description of the elementary flow).

## Meta information

Contains information about the elementary flow (its name, unit, classification, etc.), about validation details and about dataset administration (version number, kind of dataset, language).

## Process information

Contains content-related metainformation for the elementary flow.

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

### `CASNumber`

- SpoldID: 502
- Type: String
- Size: 11
- Options: zero fill from front
- Multiple occurences: No
- Required: No

Indicates the number according to the Chemical Abstract Service (CAS). The Format of the CAS-number: 000000-00-0, where the first string of digits needs not to be complete (i.e. less than six digits are admitted).

Not applicable for impact categories.

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

Contains metaInformation about the validation of elementary flow datasets.

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

Contains information about the person that compiled and entered the elementary flow dataset in the database and about kind of publication and the accessibility of the dataset.

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
