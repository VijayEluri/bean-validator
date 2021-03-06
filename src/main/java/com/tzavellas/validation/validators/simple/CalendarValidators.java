/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tzavellas.validation.validators.simple;

import java.util.Calendar;

import com.tzavellas.validation.validators.Validator;

public class CalendarValidators {

	public static final class After implements Validator<Calendar> {
		private final Calendar date;
	
		public After(Calendar date) {
			this.date = date;
		}
	
		public boolean isValid(Calendar value) {
			return value.after(date);
		}
	}

	public static final class Before implements Validator<Calendar> {
		private final Calendar date;
	
		public Before(Calendar date) {
			this.date = date;
		}
	
		public boolean isValid(Calendar value) {
			return value.before(date);
		}
	}

	public static final class Future implements Validator<Calendar> {
		public boolean isValid(Calendar value) {
			return Calendar.getInstance().before(value);
		}
	}

	public static final class Past implements Validator<Calendar> {
		public boolean isValid(Calendar value) {
			return Calendar.getInstance().after(value);
		}
	}
}
