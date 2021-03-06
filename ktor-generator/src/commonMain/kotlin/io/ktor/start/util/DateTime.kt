/*
 * Copyright 2018 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.ktor.start.util

expect class DateTime

expect fun NewDateTime(): DateTime
expect fun NewDateTime(time: Long): DateTime
expect val DateTime.time: Long

expect val DateTime.fullYear: Int
expect val DateTime.month: Int
expect val DateTime.date: Int
expect val DateTime.hours: Int
expect val DateTime.minutes: Int
expect val DateTime.seconds: Int
