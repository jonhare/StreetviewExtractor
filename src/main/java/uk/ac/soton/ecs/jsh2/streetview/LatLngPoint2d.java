package uk.ac.soton.ecs.jsh2.streetview;

import org.openimaj.math.geometry.point.AbstractPoint2d;
import org.openimaj.math.geometry.point.Point2d;

import com.google.maps.model.LatLng;

/**
 * A warpper around {@link LatLng} that makes it an openimaj coordinate/point2d
 *
 * @author Jonathon Hare (jsh2@ecs.soton.ac.uk)
 *
 */
public class LatLngPoint2d extends AbstractPoint2d {
	public LatLng latlng;

	public LatLngPoint2d(LatLng latlng) {
		this.latlng = latlng;
	}

	@Override
	public Point2d copy() {
		return new LatLngPoint2d(new LatLng(latlng.lat, latlng.lng));
	}

	@Override
	public Number getOrdinate(int dimension) {
		if (dimension == 0)
			return latlng.lat;
		return latlng.lng;
	}

	@Override
	public void setOrdinate(int dimension, Number value) {
		if (dimension == 0)
			latlng.lat = value.doubleValue();
		latlng.lng = value.doubleValue();
	}
}
