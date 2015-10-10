package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import spittr.Spittle;

@Component
public class SpittleRepositoryInstance implements SpittleRepository{

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> result = new ArrayList<>();
		Spittle s01 = new Spittle(1l, "mess01", new Date(), 5.5, 6.6);
		Spittle s02 = new Spittle(2l, "mess02", new Date(), 7.7, 7.7);
		Spittle s03 = new Spittle(3l, "mess03", new Date(), 8.8, 8.8);
		result.add(s01);
		result.add(s02);
		result.add(s03);
		
		return result;
	}

}
