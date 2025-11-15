#!/bin/bash

mvn javadoc:javadoc -Dsubpackages=com.luisantolin.daw.prog.geometria

echo "INFORMACION: Javadoc generado en [$PWD/target/site/apidocs/index.html]"

