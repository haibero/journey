## Journey

Journey is a project that seeks to re-imagine how we share our musical experiences with others.  At a high level, there 
are two primary use-cases that Journey might fill:

1. The concept of a "Journey", which is trivially a graph of linked "Crossroads", each of which might be an album, 
playlist, song, or possibly other media.  This concept focuses on the possible perceived relationships between art, and 
the ability to trace or lay out one's musical path, so that if you stumble on a progression that works really well (
whether to teach a genre, introduce an artist, or compete as the best journeyman DJ with your friends for aux rights), 
you are enabled to share it with others simply.  This would be intended to integrate with Spotify/Soundcloud to at a 
minimum provide external links, and later an integrated media player to not re-route from the app, with the final goal 
of becoming a social space for friends to share and discover musical Journeys in an engaging and immersive way (more-so than just
linking someone your soundcloud mix).


2. A toolkit to help musicians prepare "SetList"s, which have an ordered list of "SetSong"s along with some meta 
information.  Each SetSong on the Setlist could have information relevant to a musician preparing to learn (or perform) the song
as part of a live set.  In a naive version, this might include a link to a reference recording, a manually constructed 
view of the song structure (verse/chorus with lyrics and chords, etc.), and any notes specific to the performance.  In a
more developed application, it could possibly integrate with Ableton(????) sets, have native recording players (and 
possibly reference practice tracks?), have pre-constructed song charts/sheets (integration with pdfs so works with 
online score websites?), metronome features, tuning tones, and "DJ AI" to help beef up or cut down SetLists to help 
musicians fine-tune a set for different gigs

To accomplish each of these, Journey intends to become a full-stack web application (and eventually mobile app) utilizing
Java Spring with GraphQL to serve data.  Until we get into feature implementation these two ideas can share a lot of 
boilerplate.  So, higher priority should be given to the tasks back-end related for now.  General roadmap (in rough priority): 
1. Naive Java Spring GraphQL to serve Journey, Crossroads, SetList, and SetSong.  Includes naive data model, functional 
persistent DB under GraphQL, tests, (possibly also RESTful API pathing?) 
2. Naive React (NextJS, Redux?) front-end to view/build above data types
4. User accounts/authentication services (probably OAuth for now)
5. Adding more complex media integration, front-end refinement to mature concepts above.
6. Spotify/Soundcloud integration
7. Cloud/distributed/CI/CD deployment (may need higher prio, intermediate step might be a local k8 deployment for integration testing and figuring out CI/CD)
8. React Native(?) mobile application to mimic webpage
9. Mature feature development (complex interactive front-end elements, integrated media players, AI decision-making, community aspect)