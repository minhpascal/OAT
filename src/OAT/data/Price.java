/*
    Open Auto Trading : A fully automatic equities trading platform with machine learning capabilities
    Copyright (C) 2015 AnyObject Ltd.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package OAT.data;

/**
 *
 * @author Antonio Yip
 */
public interface Price {

    /**
     * Get price, equals getClose() for bar.
     *
     * @return can be -1 if not available
     */
    public double getPrice();

    /**
     * Get size, equals volume for bar.
     *
     * @return can be -1 if not available.
     */
    public long getSize();

    /**
     * Get the first updated time of the price, equals getOpenTime() for bar.
     *
     * @return UNIX time in milliseconds
     */
    public long getTime();
}