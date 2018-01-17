package com.cyc.baseclient.util.query;

/*
 * #%L
 * File: QuerySpecification.java
 * Project: Base Client
 * %%
 * Copyright (C) 2013 - 2018 Cycorp, Inc.
 * %%
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
 * #L%
 */

import java.util.Set;

/**
 * @version $Id: QuerySpecification.java 176591 2018-01-09 17:27:27Z nwinant $
 * @author  mreimers
 */
public interface QuerySpecification {
  
  public String getGloss();
  
  public Object getQuestion();
  
  public Set getConstraints();
  public Set getFilteredConstraints(Class constraintType);
  
  public Object clone();
}
