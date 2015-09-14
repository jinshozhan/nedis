/**
 * Copyright (c) 2015 Wandoujia Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wandoulabs.nedis.protocol;

import io.netty.util.concurrent.Future;

import java.util.List;

/**
 * @author Apache9
 * @see http://redis.io/commands#transactions
 */
public interface TransactionsCommands {

    public static final String QUEUED = "QUEUED";

    Future<Void> discard();

    Future<List<Object>> exec();

    Future<Void> multi();

    Future<Void> unwatch();

    Future<Void> watch(byte[]... keys);
}
