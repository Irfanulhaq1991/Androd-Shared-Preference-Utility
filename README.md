### Description
A wrapper around ***Android SharedPreferences*** to reduce boilerplate code and facilitate its use.

[ ![Download](https://api.bintray.com/packages/irfankhan/android_stuff/sharedpref/images/download.svg) ](https://bintray.com/irfankhan/android_stuff/sharedpref/_latestVersion)
### Adding to project
Add the following line to the app Gradle file dependencies section.
```
implementation 'com.irfan.android:sharedpref:1.0.0'
```
### Usage
Initilise it in the Application class
```
class app:Application() {

    override fun onCreate() {
        super.onCreate()
        SharedPref.initialize("name",this)

    }
 }
```
Create a constants file Keys.kt
```
object Keys {
    const val MY_KEY = "mykey"
}
```

To save a value 
```
SharedPref.getInstance().save(MY_KEY,"value")
```

To read a value
```
 SharedPref.getInstance().read(MY_KEY,"")
```
| Method      | Arguments          | Default  values                           |
|-------------|--------------------|-------------------------------------------|
| initialize  | Name, Context      |                                           |
| getInstance |                    |                                           |
| save        | Key, value         |                                           |
| read        | Key, default value | Int(0), Long(OL), String(""), float(0.0f) |

### License
Apache-2.0
