/**
 *Copyright 2018 hanbin
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 */

package com.example.springBootProject.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Config 类 获取application.yml中定义的属性值
 * @author renxw
 * @version 20180725
 */
@Component
@ConfigurationProperties(prefix="my")
public class Config {

	private  List<String> servers = new ArrayList<String>();
	
	public	List<String> getServers(){
		return this.servers;
	}
	
}
