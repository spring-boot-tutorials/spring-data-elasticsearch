package com.example.Elasticsearch;

import org.instancio.Instancio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticsearchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchApplication.class, args);
	}

	@Autowired
	ConferenceRepository conferenceRepository;

	@Override
	public void run(String... args) throws Exception {
		conferenceRepository.deleteAll();

		// 1. save
		var conference = Instancio.create(Conference.class);
		conference.setName("marcus chiu");
		var returnedConference = conferenceRepository.save(conference);
		System.out.println("1. save");
		System.out.println(returnedConference);

		// 2. saveAll
		int count = 10;
		var conferences = Instancio.ofList(Conference.class)
				.size(count)
				.create();
		System.out.println("2. saveAll");
		conferenceRepository.saveAll(conferences)
				.forEach(System.out::println);

		// 3. method query
		System.out.println("3. method query");
		conferenceRepository.findByName("marcus chiu").forEach(System.out::println);
	}
}
