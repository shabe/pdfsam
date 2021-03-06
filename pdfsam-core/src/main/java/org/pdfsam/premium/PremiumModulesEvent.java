/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 24 ott 2015
 * Copyright 2013-2014 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.premium;

import java.util.Collections;
import java.util.List;

import org.pdfsam.support.RequireUtils;

/**
 * Response to a fetch premium modules request
 * 
 * @author Andrea Vacondio
 */
public class PremiumModulesEvent {

    public final List<PremiumModule> premiumModules;

    public PremiumModulesEvent(List<PremiumModule> premiumModules) {
        RequireUtils.requireNotNull(premiumModules, "Premium modules cannot be null");
        this.premiumModules = Collections.unmodifiableList(premiumModules);
    }
}
