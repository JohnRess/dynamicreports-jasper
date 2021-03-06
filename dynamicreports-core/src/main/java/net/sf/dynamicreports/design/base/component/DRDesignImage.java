/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2015 Ricardo Mariaca
 * http://www.dynamicreports.org
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.design.base.component;

import net.sf.dynamicreports.design.definition.component.DRIDesignImage;
import net.sf.dynamicreports.design.definition.expression.DRIDesignExpression;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.constant.ImageScale;

/**
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 */
public class DRDesignImage extends DRDesignHyperlinkComponent implements DRIDesignImage {
	private ImageScale imageScale;
	private DRIDesignExpression imageExpression;
	private Boolean usingCache;
	private Boolean lazy;
	private HorizontalAlignment horizontalAlignment;

	public DRDesignImage() {
		super("image");
	}

	@Override
	public DRIDesignExpression getImageExpression() {
		return imageExpression;
	}

	public void setImageExpression(DRIDesignExpression imageExpression) {
		this.imageExpression = imageExpression;
	}

	@Override
	public ImageScale getImageScale() {
		return imageScale;
	}

	public void setImageScale(ImageScale imageScale) {
		this.imageScale = imageScale;
	}

	@Override
	public Boolean getUsingCache() {
		return usingCache;
	}

	public void setUsingCache(Boolean usingCache) {
		this.usingCache = usingCache;
	}

	@Override
	public Boolean getLazy() {
		return lazy;
	}

	public void setLazy(Boolean lazy) {
		this.lazy = lazy;
	}

	@Override
	public HorizontalAlignment getHorizontalAlignment() {
		return horizontalAlignment;
	}

	public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
		this.horizontalAlignment = horizontalAlignment;
	}

}
