/*
 *
 *
 * Copyright 2016 Symphony Communication Services, LLC
 *
 * Licensed to Symphony Communication Services, LLC under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package com.symphony.jirabot.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ryan.dsouza on 5/27/16.
 */
@JsonIgnoreProperties(
        ignoreUnknown = true
)

public class JiraProject {

    private String self;
    private String id;
    private String key;
    private String description;
    private String name;
    private String[] projectKeys;
    private String projectTypeKey;

    public JiraProject() {

    }

    public String getSelf() {
        return self;
    }

    public String getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String[] getProjectKeys() {
        return projectKeys;
    }

    public String getProjectTypeKey() {
        return projectTypeKey;
    }
}
