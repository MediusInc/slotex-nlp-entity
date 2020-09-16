![SloTex NLP Logo](https://slotex.si/images/slotex_logo_entity.svg)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=si.slotex.nlp%3Aslotex-nlp-entity&metric=alert_status)](https://sonarcloud.io/dashboard?id=si.slotex.nlp%3Aslotex-nlp-entity)
[![Build Status](https://travis-ci.com/MediusInc/slotex-nlp-entity.svg?branch=master)](https://travis-ci.com/github/MediusInc/slotex-nlp-entity)
[![License](https://img.shields.io/github/license/MediusINC/slotex-nlp-entity)]( https://github.com/MediusInc/slotex-nlp-entity/blob/master/LICENSE.md)
[![Slack](https://img.shields.io/badge/slack-@pkp2019-yellow.svg?logo=slack)](https://join.slack.com/t/pkp2019-slotex/shared_invite/enQtNzkwNTk5MDMyOTc2LTNhOTQ0MTU3ZDMzMDM2NDRhYTRlNWRkOWRmZTk0N2YzNmExNDliYTU1NGI4NWFjNjFhNTFkNTcyNzhlZGIzZmU)
[![Maven Central](https://img.shields.io/maven-central/v/si.slotex.nlp/slotex-nlp-entity)](https://mvnrepository.com/artifact/si.slotex.nlp/slotex-nlp-entity)

A library which contains POJOs for representation of all the objects stored in the database.

## Downloading

slotex-nlp-entity is available via maven central (check out Maven central for the latest version — the version below may not be the most recent):

```
<dependency>
 <groupId>si.slotex.nlp</groupId>
  <artifactId>slotex-nlp-entity</artifactId>
  <version>1.0.0</version>
</dependency>
```

Snapshot builds of jbool_expressions are also published to sonatype:

```
<repository>
  <id>oss.sonatype.org-snapshot</id>
  <url>http://oss.sonatype.org/content/repositories/snapshots</url>
  <releases>
    <enabled>false</enabled>
  </releases>
  <snapshots>
     <enabled>true</enabled>
   </snapshots>
</repository>

<dependency>
 <groupId>si.slotex.nlp</groupId>
  <artifactId>slotex-nlp-entity</artifactId>
  <version>1.0.1-SNAPSHOT</version>
</dependency>
```

## Building

slotex-nlp-entity is built with Maven. To build from source,

```
mvn package
```

## Project Funding

|  <img alt="Public Scholarship, Development, Disability and Maintenence Fund of the Republic of Slovenia" src="https://slotex.si/images/logo-sklad.svg" height="65" /> |  <img alt="Ministry of Education, Science and Sport" src="https://slotex.si/images/logo-mizs.svg" height="65"/> |  <img alt="European Social Fund" src="https://slotex.si/images/logo-pkp.svg" height="65"/> |
| --- | --- | --- |

**This project was founded by Republic of Slovenia and European union from European social found.**

