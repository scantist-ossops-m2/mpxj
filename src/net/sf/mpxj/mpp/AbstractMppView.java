/*
 * file:       AbstractMppView.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2003
 * date:       27/01/2006
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.mpp;

import net.sf.mpxj.AbstractView;


/**
 * This abstract class implements functionality common to all MPP views.
 */
public abstract class AbstractMppView extends AbstractView
{
   /**
    * Remove the ampersand embedded in the view name.
    *
    * @param name view name
    * @return view name without the ampersand
    */
   protected String removeAmpersand (String name)
   {
      if (name != null)
      {
         if (name.indexOf('&') != -1)
         {
            StringBuffer sb = new StringBuffer();
            int index = 0;
            char c;

            while (index < name.length())
            {
               c = name.charAt(index);
               if (c != '&')
               {
                  sb.append(c);
               }
               ++index;
            }

            name = sb.toString();
         }
      }

      return (name);
   }
}
