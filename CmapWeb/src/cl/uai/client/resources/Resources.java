// This file is part of Moodle - http://moodle.org/
//
// Moodle is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// Moodle is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with Moodle.  If not, see <http://www.gnu.org/licenses/>.

/**
 * Strings for component 'block_news_items', language 'en', branch 'MOODLE_20_STABLE' 
*
* @package   block_news_items
* @copyright 2011 onwards Jorge Villalon {@link http://villalon.cl}
* @license   http://www.gnu.org/copyleft/gpl.html GNU GPL v3 or later
*/
package cl.uai.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * @author Jorge Villalon
 *
 */
public interface Resources extends ClientBundle {
	public static final Resources INSTANCE =  GWT.create(Resources.class);

	@Source("undo.png")
	ImageResource undo();
	
	@Source("redo.png")
	ImageResource redo();
	
	@Source("exportxml.png")
	ImageResource exportxml();

	@Source("help.png")
	ImageResource help();

	@Source("new.png")
	ImageResource newmap();

	@Source("newConcept.png")
	ImageResource newconcept();

	@Source("newRelationship.png")
	ImageResource newrelationship();

	@Source("edit.png")
	ImageResource edit();

	@Source("delete.png")
	ImageResource delete();

	@Source("newRelationship.png")
	ImageResource addSource();

	@Source("newRelationship.png")
	ImageResource addTarget();
}
