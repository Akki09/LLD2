Builder Design Pattern
Requirements:
1. I have multiple fields that is required at the time of creation of object but not every time. (Constructor explosion/telescoping should be avoided)
2. I don't want to create an OBJECT without performing the validation of the fields.
If we resolve 1st requirement via default constructor and then use the respective setter method.
Then 2nd requirement become another issue for us to resolve
For eg. if we create an Object with default constructor and then at the time of setting value via setter method we put validation