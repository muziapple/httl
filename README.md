======
**Bug List**
- ConfigUtils.WINDOWS_FILE_PATTERN
======
**Core Improvement**
* 解释执行与编译执才的自动切换，类似于JVM的JIT。
* 完整的泛型推导，和Java的泛型推导相同。
* 生成字节码细节上的优化，比如减少instanceof，减少反射，减少装箱。
* 异常信息友好性提示，比如运行时业务报错，提示在模板中的位置。
* 在热加载时，支持卸载之前编译的模板类。
* 支持磁盘缓存字节码，减少重启时编译。
* 重构AST树，使之可扩展。
======

Hyper-Text Template Language and Engine.

Homepage:

http://httl.github.io

Download:

https://github.com/httl/httl/tags

git clone https://github.com/httl/httl.git

Compile:

mvn install -Dmaven.test.skip

Eclipse:

mvn eclipse:eclipse -DdownloadSources

Eclipse -> File -> Import -> Existing Projects into Workspace -> Browse -> Finished

Eclipse -> Window -> Preferences -> General -> Content Types -> Text -> HTML -> Add -> *.httl
