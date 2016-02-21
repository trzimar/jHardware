/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jutils.jhardware.model;

import java.util.Map;

/**
 *
 * @author Javier Garcia Alonso
 */
public class OSInfo implements ComponentInfo {
    private String version;
    private String lastBootTime;
    private String name;
    private String manufacturer;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastBootTime() {
        return lastBootTime;
    }

    public void setLastBootTime(String lastBootTime) {
        this.lastBootTime = lastBootTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    private Map<String, String> fullInfo;

    
    
    public Map<String, String> getFullInfo() {
        return fullInfo;
    }

    public void setFullInfo(Map<String, String> fullInfo) {
        this.fullInfo = fullInfo;
    }
    
}