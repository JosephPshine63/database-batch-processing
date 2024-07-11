package dev.pioruocco.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import dev.pioruocco.model.StudentResponse;

@Component
public class FirstItemWriter implements ItemWriter<StudentResponse> {

	@Override
	public void write(List<? extends StudentResponse> items) throws Exception {
		System.out.println("Inside Item Writer");
		items.stream().forEach(System.out::println);
	}

}
