// ------------------------------------------------------------------------------
// Copyright (c) 2015 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.onedrive.sdk.generated;

import com.onedrive.sdk.concurrency.*;
import com.onedrive.sdk.core.*;
import com.onedrive.sdk.extensions.*;
import com.onedrive.sdk.http.*;
import com.onedrive.sdk.generated.*;
import com.onedrive.sdk.options.*;
import com.onedrive.sdk.serializer.*;

import java.util.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Item Request.
 */
public class BaseItemRequest extends BaseRequest implements IBaseItemRequest {

    /**
     * The request for the Item
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param options The options for this request
     */
    public BaseItemRequest(String requestUrl, IOneDriveClient client, List<Option> options) {
        super(requestUrl, client, options, Item.class);
    }

    public void get(final ICallback<Item> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public Item get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #patch(Item, ICallback)}
     */
    @Deprecated public void update(final Item sourceItem, final ICallback<Item> callback) {
        this.patch(sourceItem, callback);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #patch(Item)}
     */
    @Deprecated public Item update(final Item sourceItem) throws ClientException {
        return this.patch(sourceItem);
    }

    public void patch(final Item sourceItem, final ICallback<Item> callback) {
        send(HttpMethod.PATCH, callback, sourceItem);
    }

    public Item patch(final Item sourceItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceItem);
    }

    public void delete(final ICallback<Void> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(Item, ICallback)}
     */
    @Deprecated public void create(final Item newItem, final ICallback<Item> callback) {
        this.post(newItem, callback);
    }

    /**
     * @deprecated  As of release 1.1.3, replaced by {@link #post(Item)}
     */
    @Deprecated public Item create(final Item newItem) throws ClientException {
        return this.post(newItem);
    }

    public void post(final Item newItem, final ICallback<Item> callback) {
        send(HttpMethod.POST, callback, newItem);
    }

    public Item post(final Item newItem) throws ClientException {
        return send(HttpMethod.POST, newItem);
    }

    public IItemRequest select(final String value) {
        getQueryOptions().add(new QueryOption("select", value));
        return (ItemRequest)this;
    }

    public IItemRequest top(final int value) {
        getQueryOptions().add(new QueryOption("top", value+""));
        return (ItemRequest)this;
    }

    public IItemRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("expand", value));
        return (ItemRequest)this;
    }
}
