SingletonV1
Normal Class which depicts what we need to solve

SingletonV2(ThreadBar, ThreadFoo)
Solve the singeton issue, but thread safety is not there

SingletonV3(Early Initialization)
It's Thread safe, but
1. Application Load time increase
2. Can't have variable config
3. Sometimes we don't even need it

SingletonV4(Lazy Initialization)
1. Make the getInstance() synchronized(All call will be slow down)
2. Get lock inside getInstance() -> Issue at multi threaded application when instance was not created(This for the first time.
Let say if 5 thread comes and checks instance == null and acquire lock one by one create 5 object
later on no issues.
3. Double lock check Full proof check

SingletonV5(Break Singleton via Serialization and Deserialization)

BreakSingletonV1 and SingletonV5(Break Singleton via Serialization and Deserialization)

BreakSingletonV2 and SingletonV4(Break Singleton via ReflectionAPIs)
