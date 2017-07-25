# GettingStartedWithHibernate
This is the study project, to get started with Hibernate, to understand ORM framework.
<hr>
<b>Description: </b> <br/>
Creating a table in the database and saving the tuples with the help of Object Relational Mapping Tool - Hibernate
<hr>
<b>Prerequisties</b><br/>
<li>Java</li>
<li>JDBC</li>
<li>MySQL or Oracle or any database</li>
<hr>
<li>Hibernate: 4.3</li> 
<li>Oracle: 12c</li> 
<li>Java: 1.8</li> 
<hr>
<b>Adding Hibernate Plugin in eclipse</b>
<li> Hibernate plugin is needed to create the configuration file of hibernate (hibernate.cfg.xml)
<li> Install hibernate plugin from Eclipse Marketplace. I have installed it from JBoss Tool 4.4.4 Final
<hr>
<li>If we want to connect to the database, we need to provide configuration.</li>
<li>Configuration is provided in hibernate.cfg.xml</li>
<li>Provide database dialect ,driver class, connection url, username and password in hibernate.cfg.xml file.</li>
<hr>
<b>When you are connecting with oracle, no need to mention the schema name so the connection URL looks like as below : </b>
<br/>
<p> jdbc:oracle:thin:@Hostname:port:SID </p>
<hr>
<li>To specify that this class [Mapped to Relation in database] is allowed to store its object in database, use @Entity annotation
<li>@Id is used for specifying primary key.
<li>To create table, specify the property name of hbm2ddl in hibernate.cfg.xml <br/>
For example: <p> <property name="hbm2ddl.auto">create</property> </p>
<hr>
Whenever you have to make changes to the database you have to follow ACID properties.

