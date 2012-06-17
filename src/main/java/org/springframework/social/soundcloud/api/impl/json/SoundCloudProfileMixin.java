/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.soundcloud.api.impl.json;



import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Annotated mixin to add Jackson annotations to SoundCloudProfile. 
 * @author Michael Lavelle
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class SoundCloudProfileMixin {

	
	@JsonCreator
	SoundCloudProfileMixin(
			@JsonProperty("id") String id, 
			@JsonProperty("username") String username, 
			@JsonProperty("avatar_url") String avatarUrl, 
			@JsonProperty("permalink_url") String permalinkUrl, 
			@JsonProperty("full_name") String fullName, 
			@JsonProperty("uri") String uri, 
			@JsonProperty("city") String city) {} 
	
	
	@JsonProperty("public_favorites_count")
	void setFavoritesCount(int favoritesCount) {}
	
	@JsonProperty("track_count")
	void setTrackCount(int trackCount) {}
	
	@JsonProperty("playlist_count")
	void setPlaylistCount(int playlistCount) {}
	
}
