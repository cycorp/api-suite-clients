/*
 * Copyright 2015 Cycorp, Inc..
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

package com.cyc.session.compatibility;

/*
 * #%L
 * File: NotResearchCycRequirement.java
 * Project: Session Client
 * %%
 * Copyright (C) 2013 - 2017 Cycorp, Inc.
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

import com.cyc.session.CycServerReleaseType;

/**
 *
 * @author nwinant
 */
public class NotResearchCycRequirement extends NotCycServerReleaseTypeRequirement implements CycSessionRequirement {
  
  public static final NotResearchCycRequirement NOT_RESEARCHCYC = new NotResearchCycRequirement();

  public NotResearchCycRequirement(String msg) {
    super(CycServerReleaseType.RESEARCHCYC, msg);
  }
  
  public NotResearchCycRequirement() {
    this("This feature is not supported in ResearchCyc.");
  }
  
}
