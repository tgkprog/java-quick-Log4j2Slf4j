java-quick-Log4j2Slf4j
======================

Sample config and code to make a slf4j with log4j2 includes runtime jars

Dependancies with log4j 

	<dependencies>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.7.7</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-slf4j-impl</artifactId>
			<version>2.1</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.1</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>2.1</version>
		</dependency>
	</dependencies>
		
Code declare sample:

	private static final Logger logger = LoggerFactory.getLogger(App.class);


log4j2.xml in classpath

	<?xml version="1.0" encoding="UTF-8"?>
	<configuration status="WARN">
	<appenders>
		<Console name="Console" target="SYSTEM_OUT">
			<PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n" />
		</Console>

		<RollingFile append="false" name="Rolling-1" fileName="/apps/eset/logs/a.log"
			filePattern="yyyy_MMM_%i.log">
			<PatternLayout>
				<pattern>%d %p %C [%t] %m%n</pattern> <!-- %d %p %C{1.} [%t] %m%n -->
			</PatternLayout>

			<!--   <OnStartupTriggeringPolicy />
			<SizeBasedTriggeringPolicy size="20 MB" />
			<TimeBasedTriggeringPolicy /> -->
			<SizeBasedTriggeringPolicy size="5mb" />
			<OnStartupTriggeringPolicy />
		</RollingFile>

	</appenders>
	<loggers>
		<root level="debug">
			<appender-ref ref="Console" />
			<appender-ref ref="Rolling-1" />
		</root>
	</loggers>
</configuration>
