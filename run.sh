mvn install
rm -R run2
mkdir run2
cd run2
tar -zxvf ../target/Ap-1-default.tar.gz 
cd Ap-1/lib
cp ../../../src/main/java/log4j2.xml .
rm slf4j-simple-1.7.7.jar

 java -cp . -jar Ap-1.jar
