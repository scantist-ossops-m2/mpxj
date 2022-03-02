/*
 * file:       MPP12CalendarFactory.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2017
 * date:       2017-10-04
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

import java.io.IOException;

import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;

import net.sf.mpxj.ProjectFile;

/**
 * MPP12-specific calendar factory.
 */
class MPP12CalendarFactory extends AbstractCalendarAndExceptionFactory
{
   /**
    * Constructor.
    *
    * @param file parent ProjectFile instance
    */
   public MPP12CalendarFactory(ProjectFile file)
   {
      super(file);
   }

   @Override protected int getCalendarIDOffset()
   {
      return 0;
   }

   @Override protected int getBaseIDOffset()
   {
      return 4;
   }

   @Override protected int getResourceIDOffset()
   {
      return 8;
   }

   @Override protected int getCalendarHoursOffset()
   {
      return 0;
   }

   @Override protected Integer getCalendarNameVarDataType()
   {
      return CALENDAR_NAME;
   }

   @Override protected Integer getCalendarDataVarDataType()
   {
      return CALENDAR_DATA;
   }

   @Override protected VarMeta getCalendarVarMeta(DirectoryEntry directory) throws IOException
   {
      return new VarMeta12(new DocumentInputStream(((DocumentEntry) directory.getEntry("VarMeta"))));
   }

   private static final Integer CALENDAR_NAME = Integer.valueOf(1);
   private static final Integer CALENDAR_DATA = Integer.valueOf(8);
}
