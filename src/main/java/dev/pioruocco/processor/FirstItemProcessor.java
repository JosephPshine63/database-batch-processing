package dev.pioruocco.processor;

import dev.pioruocco.mysql.entity.Student;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class FirstItemProcessor implements ItemProcessor<dev.pioruocco.postgresql.entity.Student, Student> {

	@Override
	public Student process(dev.pioruocco.postgresql.entity.Student item) throws Exception {
		
		System.out.println(item.getId());
		
		Student student = new
                Student();
		
		student.setId(item.getId());
		student.setFirstName(item.getFirstName());
		student.setLastName(item.getLastName());
		student.setEmail(item.getEmail());
		student.setDeptId(item.getDeptId());
		student.setIsActive(item.getIsActive() != null ? 
				Boolean.valueOf(item.getIsActive()) : false);
		
		return student;
		
	}

}
