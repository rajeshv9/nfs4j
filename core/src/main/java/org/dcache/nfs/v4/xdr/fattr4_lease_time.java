/*
 * Copyright (c) 2009 - 2014 Deutsches Elektronen-Synchroton,
 * Member of the Helmholtz Association, (DESY), HAMBURG, GERMANY
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Library General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this program (see the file COPYING.LIB for more
 * details); if not, write to the Free Software Foundation, Inc.,
 * 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.dcache.nfs.v4.xdr;
import org.dcache.xdr.*;
import java.io.IOException;

public class fattr4_lease_time extends nfs_lease4 {

    public fattr4_lease_time() {
    }

    public fattr4_lease_time(int value) {
        super();
    }

    public fattr4_lease_time(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        super(xdr);
    }
}
// End of fattr4_lease_time.java
