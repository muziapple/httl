/*
 * Copyright 2011-2013 HTTL Team.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package httl.spi;

/**
 * Variable Resolver. (SPI, Singleton, ThreadSafe)渲染模板过程
 * 1.4.1.1模板中的变量，均从Context中读取
 *   Context --> parent Context
 *   root Context --> Resolver
 * @author Liang Fei (liangfei0201 AT gmail DOT com)
 */
public interface Resolver {

	/**
	 * Get the variable value.
	 * 
	 * @param key - variable key
	 * @return variable value
	 */
	Object get(String key);

}