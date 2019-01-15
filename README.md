# mrgxxd-input-validation-android
Library input validation for android and give boolean value (true/false)

## Installation
Step 1. Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.mrgxxd:mrgxxd-input-validation-android:1.0.2'
}
```

## Usage
1. Kotlin
```kotlin
val isEmail = InputValidation().isEmail("Your Email")
val isName = InputValidation().isName("Your Name")
val isStrongPassword = InputValidation().isStrongPassword("Your Password") // minimum requirement have Uppercase,Lowercase,Number,SpecialCharacter, and Length >= 6
val isPhoneNumber1 = InputValidation().isPhoneNumber("Your Phone Number")
val isPhoneNumber2 = InputValidation().isPhoneNumber("Your Phone Number", "your code language") // active choice "ID"
val isMatchRegex = InputValidation().isMatchRegex("Your Custom Regex")
```
2. Java
```java
InputValidation inputValidation = new InputValidation();

boolean isEmail = inputValidation.isEmail("Your Email");
boolean isName = inputValidation.isName("Your Name");
boolean isStrongPassword = inputValidation.isStrongPassword("Your Password"); // minimum requirement have Uppercase,Lowercase,Number,SpecialCharacter, and Length >= 6
boolean isPhoneNumber1 = inputValidation.isPhoneNumber("Your Phone Number");
boolean isPhoneNumber2 = inputValidation.isPhoneNumber("Your Phone Number", "your code language"); // active choice "ID"
boolean isMatchRegex = inputValidation.isMatchRegex("Your Custom Regex");
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)