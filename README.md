# zxcvbn4j-wrapper
This project should illustrate how to create a wrapper over the password strength library zxcvbn4j to use custom resources, namely dictionaries and keyboard layouts

## configure the resources
By adding config files (.dictionaries, .slantedKeyboards and .alignedKeyboards) you can specify what dictionaries and layouts should be used for calculating the password strength.
The files have to be placed in the directory:  `src/main/resources/com/nulabinc/matchers`

## add your own resources
It is also possible to add your own dictionaries and layouts the only thing you have to do is to put them in te according directories:

* for dictionaries -> `src/main/resources/com/nulabinc/matchers/dictionaries`
* for slanted keyboards -> `src/main/resources/com/nulabinc/matchers/keyboards/slanted`
* for aligned keyboards, like number pads -> `src/main/resources/com/nulabinc/matchers/keyboards/aligned`

## using the dictionary.gradle file
This branch also illustrates how it is possible to use the dictionary.gradle-file to rank your custom dictionaries