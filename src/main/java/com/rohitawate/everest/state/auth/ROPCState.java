/*
 * Copyright 2019 Rohit Awate.
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rohitawate.everest.state.auth;

import com.rohitawate.everest.auth.oauth2.tokens.ROPCToken;

public class ROPCState extends OAuth2FlowState {
    public String username;
    public String password;
    public String clientSecret;

    public String accessTokenURL;
    public String redirectURL;

    public ROPCToken accessToken;

    public ROPCState() {
        this.accessToken = new ROPCToken();
    }

    @Override
    public String toString() {
        return "ROPCState{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", accessTokenURL='" + accessTokenURL + '\'' +
                ", redirectURL='" + redirectURL + '\'' +
                ", accessToken=" + accessToken +
                ", clientID='" + clientID + '\'' +
                ", enabled=" + enabled +
                ", scope='" + scope + '\'' +
                ", headerPrefix='" + headerPrefix + '\'' +
                '}';
    }
}