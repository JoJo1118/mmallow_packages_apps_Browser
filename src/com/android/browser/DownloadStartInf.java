/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.android.browser;

import  com.android.browser.Tab;

public class DownloadStartInf{
    public Tab tab;
    public String url;
    public String userAgent;
    public String contentDisposition;
    public String mimetype;
    public String referer;
    public long contentLength;
    public DownloadStartInf(Tab tab,String url,String userAgent,String contentDisposition,String mimetype,String referer,long contentLength){
            this.tab = tab ;
            this.url = url;
            this.userAgent = userAgent;
            this.contentDisposition = contentDisposition;
            this.mimetype = mimetype;
            this.referer = referer;
            this.contentLength = contentLength;
            }
}
